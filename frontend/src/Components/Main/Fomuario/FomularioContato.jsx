import { useRef } from "react";
import api from "../../../Server/api";
import "../ContatoMain/ContatoMain.css"

export default function FomularioContato(){

  const email = useRef();

  const mensagem = useRef(); 
 
  const Salvar = (event) => {
    event.preventDefault();   
      api.post("/contato/salvar", {
        email: email.current.value,
        mensagem: mensagem.current.value,
      }).then(() => {
        alert("Obrigado, sua mensagem foi enviada!")
        window.location.href="/"
      }).catch((err) => console.log(err)); 
  };

    return(
       <>
      <div class="divMensagem">
           <h5 class="titulos">Envie sua mensagem</h5>
        <div className="container">
          <form class="formMensagem" onSubmit={Salvar}>
          
          <input type="text" id="email" name="email" placeholder="E-mail" ref={email} required/>          
       
          <label htmlFor="mensagem"></label>
          <textarea id="mensagem" name="mensagem" placeholder="Mensagem" className="textArea" ref={mensagem}></textarea>
          
          <input type="submit"  class="btn" value="Enviar"/>
         
          </form>
          </div>
      </div>
       </>
    );
}