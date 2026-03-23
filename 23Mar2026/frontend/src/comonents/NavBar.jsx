function NavBar(){
    return(
        <>
         <div className="flex justify-between px-5 py-3">
            <div className="flex gap-2">
             <div>LOGO</div>
             <div>JCBM COLLEGE</div>
            </div>

         <div className="flex gap-5">
            <div>Home</div>
            <div>About us</div>
            <div>Services</div>
            <div>Products</div>
            <div>Contact us</div>
        </div>

        <div className="flex gap-5">
            <div>Signup</div>
            <div>Login</div>
        </div>
         </div>
        </>
    )
}
export default NavBar;