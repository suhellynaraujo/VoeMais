import axios from "axios";
import { useEffect, useState } from "react/cjs/react.production.min";
import Footer from "../../Components/Footer/Footer";
import Nav from "../../Components/Nav/Nav";
import api from "../../Server/api"

import './Cadastro.css'
export default function Cadastro(){

  const[cadastro, setCadastro]

  useEffect(() => {
    axios.create('/cadastro')
      .then(response => {
          set(response.data)
      });
    }, []);

    return(
         <>
         
    <Nav/>
    <main className="cadastro">
    <div className="cadastrar">
      <h3>Criar Conta</h3>
      <form>
        <input type="nome" placeholder="Nome"/>
        <input type="email" placeholder="Email"/>
        <input type="password" placeholder="Senha"/>
        <button className="btn"> Cadastrar </button>
      </form>     
    </div>
  </main>
   
  <Footer></Footer>



 </>
    );
}