import { Link } from "react-router-dom";
import Nav from "../../Components/Nav/Nav";
import "./Login.css";
import Footer from '../../Components/Footer/Footer';

export default function Login(){
    return( 

        <>
        <Nav></Nav>
    <main className="divLogin">
    <div className="entrar">
      <h3>Bem Vindo de Volta!</h3>
      <form>
        <input type="email" placeholder="Email"/>
        <input type="password" placeholder="Senha"/>

        <Link to="#"className="senha"><a >Esqueceu sua Senha?</a></Link>
        <button className="btn"> Entrar </button>
      </form>     
      
        <p> Ainda não tem cadastro? <Link to="/Cadastro" className="clique">Clique aqui!</Link> </p>
      
    </div>
  </main>
   
        <Footer/>

 </>
    );
}