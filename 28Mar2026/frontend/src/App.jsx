import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import TodoList from "./pages/TodoList";
import CreateTodo from "./pages/CreateTodo";
import EditTodo from "./pages/EditTodo";
import Login from "./components/Login";
import Register from "./components/Register";

export default function App() {
  return (
    <>
      <BrowserRouter>
        <nav>
          <Link to="/">Home </Link>
          <Link to="/create"> | Create</Link>
          <Link to="/login"> | Login</Link>
          <Link to="/register"> | Register</Link>
        </nav>
        <Routes>
          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Register />} />
          <Route path="/" element={<TodoList />} />
          <Route path="/create" element={<CreateTodo />} />
          <Route path="/edit/:id" element={<EditTodo />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}
