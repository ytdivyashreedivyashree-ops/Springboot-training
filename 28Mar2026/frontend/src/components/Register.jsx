import axios from "axios";
import { useState } from "react";
import { Link, useNavigate } from "react-router-dom";

export default function Register() {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [message, setMessage] = useState("");
  const navigate = useNavigate();

  const handleRegister = async (e) => {
    e.preventDefault();

    try {
      const response = await axios.post("http://localhost:8080/auth/register", {
        username,
        password,
      });

      console.log(response.data);
      setMessage("Register successful");

      setTimeout(() => {
        navigate("/");
      }, 1000);
    } catch (error) {
      console.log(error);
      setMessage("Register failed");
    }
  };

  return (
    <div className="min-h-screen flex items-center justify-center bg-gray-100">
      <form
        onSubmit={handleRegister}
        className="bg-white shadow-lg rounded-2xl p-8 w-full max-w-md"
      >
        <h1 className="text-3xl font-bold text-center text-green-600 mb-2">
          Create Account
        </h1>
        <p className="text-center text-gray-500 mb-6">
          Register to get started
        </p>

        <div className="flex flex-col gap-4">
          <input
            type="text"
            placeholder="Enter username"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
            className="text-black px-4 py-3 border border-gray-300 rounded-xl outline-none focus:ring-2 focus:ring-green-400"
          />

          <input
            type="password"
            placeholder="Enter password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            className="text-black px-4 py-3 border border-gray-300 rounded-xl outline-none focus:ring-2 focus:ring-green-400"
          />

          <button
            type="submit"
            className="bg-green-600 text-white py-3 rounded-xl font-semibold hover:bg-green-700 transition"
          >
            Register
          </button>

          {message && (
            <p className="text-center text-sm text-gray-700">{message}</p>
          )}

          <p className="text-center text-sm text-gray-500">
            Already have an account?{" "}
            <Link to="/" className="text-green-600 font-medium">
              Login
            </Link>
          </p>
        </div>
      </form>
    </div>
  );
}
