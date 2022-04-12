import { useRef } from "react";
import Footer from "../../Components/Footer/Footer";
import Nav from "../../Components/Nav/Nav";
import api from "../../Server/api";
import "./Cadastro.css";

export default function Cadastro() { 

  const nome = useRef();
  const email = useRef();
  const senha = useRef();
 
  const Cadastrar = (event) => {
    event.preventDefault();    
      api.post("/cadastro/salvar", {
        nome: nome.current.value,
        email: email.current.value,
        senha: senha.current.value,
      })
      .then(() => {
        alert("Cadastro realizado com sucesso!")
        window.location.href="/"

      }).catch((err) => console.log(err));
      
  };
  

  return (
    <>
      <Nav />
      <main className="mainBanner">
        <div className="cadastro">
        <div className="cadastrar">
          <h3>Criar Conta</h3>
          <form onSubmit={Cadastrar}>
            <input type="nome" placeholder="Nome" ref={nome} required/>
            <input type="email" placeholder="Email" ref={email} required/>
            <input type="password" placeholder="Senha" ref={senha} required/>
            <button className="btn"> Cadastrar </button>
           

          </form>         
        </div> 
        </div>       
      </main>   
      <Footer></Footer>
    </>
  );
}
