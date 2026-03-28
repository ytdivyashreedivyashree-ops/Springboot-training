package com.example.sample.auth;

import com.example.sample.user.User;
import com.example.sample.user.UserRepo;

import java.util.List;

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
        user.setRole("USER");

        userRepo.save(user);
        return "User Register Successfully";
    }
        public String Login(String username,String password){
            User user=userRepo.findByUsername(username).orElseThrow(
                    ()->new RuntimeException("User not found"));
            boolean isMatch=passwordEncoder.matches(password,user.getPassword());
            if(!isMatch){
                throw new RuntimeException("Invalid Credentials");
            }
            return jwtUtil.generateToken(username);
        }

        public List<User> getAllUsers() {
             return userRepo.findAll();
        }
        public User getUserByUsername(String username) {
        return userRepo.findByUsername(username).orElse(null);
    }
}
