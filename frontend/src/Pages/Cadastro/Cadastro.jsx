import { useRef } from "react";
import { useNavigate } from "react-router-dom";
import Footer from "../../Components/Footer/Footer";
import Nav from "../../Components/Nav/Nav";
import api from "../../Server/api";
import { validateEmail } from "../../Server/validation";
import "./Cadastro.css";

export default function Cadastro() { 

  const navigate = useNavigate();

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
      .then(() => navigate()).catch((err) => console.log(err));
      
  };

  const Cadastrado = () => {
   if( email  == null){
      alert("Realize seu cadastro inserindo as informações nos campos corretamente!")
    }
    else{
      alert("Cadastro Realizado com Sucesso!")
    }
    
    
    if(!validateEmail(email)){
      return;
    }


  };



 
  return (
    <>
      <Nav />
      <main className="cadastro">
        <div className="cadastrar">
          <h3>Criar Conta</h3>
          <form onSubmit={Cadastrar}>
            <input type="nome" placeholder="Nome" ref={nome}/>
            <input type="email" placeholder="Email" ref={email}/>
            <input type="password" placeholder="Senha" ref={senha}/>
            <button className="btn" onClick={Cadastrado}> Cadastrar </button>
          </form>
        </div>
      </main>

      <Footer></Footer>
    </>
  );
}
