import { Link } from "react-router-dom";
import Nav from "../../Components/Nav/Nav";
import "./Login.css";
import Footer from "../../Components/Footer/Footer";
import { useRef, } from "react";
import api from "../../Server/api";

export default function Login() {

 
  const email = useRef();
  const senha = useRef();

  const Logar = (event) => {

    event.preventDefault();
    api.post("/login/salvar", {
        email: email.current.value,
        senha: senha.current.value,
      })
      .then(() => {
        alert("Você está logado!");
        window.location.href = "/";
      })
      .catch((err) => console.log(err));
      
  };



  return (
    <>
      <Nav></Nav>
    
        <main className="mainBanner">
          <div className="divLogin">
          <div className="entrar">
            <h3>Bem Vindo de Volta!</h3>
            <form onSubmit={Logar}>
              <input
                type="email"
                placeholder="Email"
                ref={email}
               
                required
              />
              <input
                type="password"
                placeholder="Senha"
                ref={senha}
               
              />
              {/*
              <Link to="#" className="senha">
                Esqueceu sua Senha?
  </Link>*/}
              <button className="btn"> Entrar </button>
            </form>

            <p>
              {" "}
              Ainda não tem cadastro?{" "}
              <Link to="/Cadastro" className="clique">
                Clique aqui!
              </Link>{" "}
            </p>
          </div>
            
          </div>          
        </main>
      <Footer />
    </>
  );
}
