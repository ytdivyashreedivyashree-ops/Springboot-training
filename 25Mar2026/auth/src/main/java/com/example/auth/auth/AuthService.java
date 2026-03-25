package com.example.auth.auth;

import com.example.auth.user.User;
import com.example.auth.user.UserRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private  final UserRepo userRepo;
    private  final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public AuthService(UserRepo userRepo, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }
    public  String register(String username,String password){
        if(userRepo.findByUsername(username).isPresent()){
            throw new RuntimeException("User already exists");
        }
        String hashedPassword= passwordEncoder.encode(password);
        User user= new User();
        user.setUsername(username);
        user.setPassword(hashedPassword);
        userRepo.save(user);
        return "User Register Successfully";
    }
        public String Login(String username,String password){
            User user=userRepo.findByUsername(username).orElseThrow(
                    ()->new RuntimeException("User not found"));
            boolean isMatch=passwordEncoder.matches(password,user.getPassword());
            if(isMatch){
                throw new RuntimeException("Invalid Credentials");
            }
            return jwtUtil.generateToken(username);
        }
}
