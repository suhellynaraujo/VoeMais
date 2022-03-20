import { useRef } from "react";
import { useNavigate } from "react-router-dom";
import api from "../../../Server/api";
import { validateEmail } from "../../../Server/validation";
import "../ContatoMain/ContatoMain.css"

export default function FomularioContato(){

  const navegate = useNavigate();

  const Enviado = () => {    
    if ( email != null){
      alert("Obrigado sua mensagem foi enviada com sucesso!")       
    } 
    
    if(!validateEmail(email)){
      return;
    }    
  };

  const email = useRef();

  const mensagem = useRef(); 
 
  const Salvar = (event) => {
    event.preventDefault();   
      api.post("/contato/salvar", {
        email: email.current.value,
        mensagem: mensagem.current.value,
      }).then(() => navegate ("/")).catch((err) => console.log(err));

       
  };

    return(
       <>
      <div class="divMensagem">
           <h5 class="titulos">Envie sua mensagem</h5>
        <div className="container">
          <form class="formMensagem" onSubmit={Salvar}>
          
          <input type="text" id="email" name="email" placeholder="E-mail" ref={email}/>          
       
          <label htmlFor="mensagem"></label>
          <textarea id="mensagem" name="mensagem" placeholder="Mensagem" className="textArea" ref={mensagem}></textarea>
          
          <input type="submit"  class="btn" value="Enviar" onClick={Enviado}/>
         
          </form>
          </div>
      </div>
       </>
    );
}