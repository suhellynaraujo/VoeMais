import { useRef } from "react";
import "../../../Pages/Destino/Destino.css"
import api from "../../../Server/api";

export default function FomularioDestino() {
  
  const nome = useRef();
  const cidade = useRef();
  const uf = useRef();
  const ida = useRef();
  const volta = useRef();

 
  const Cadastrar = (event) => {
    event.preventDefault();    
      api.post("/destino/salvar", {
        nome: nome.current.value,
        cidade: cidade.current.value,
        uf: uf.current.value,
        ida: ida.current.value,
        volta: volta.current.value
      })
      .then(() => {
        alert("Destino reservado!")
        window.location.href="/"
      }).catch((err) => console.log(err));
      
  };
  

  return (
    <div className="container destino ca ">
      <div className="fundo">
        <h1 className="titulos">Reserve Agora!</h1>
        <form class="formdestino" onSubmit={Cadastrar}>
          <input type="text" id="nome" name="nome" placeholder="Nome do destino" ref={nome} required/>

          <input type="text" id="cidade" name="cidade" placeholder="Cidade" ref={cidade} required/>

          <input type="text" id="uf" name="uf" placeholder="UF" ref={uf} required/>

          <input type="text" id="ida" name="ida" placeholder="Ida"  ref={ida}/>

          <input type="text" id="volta" name="volta" placeholder="volta" ref={volta}/>

          <button className="btn2"> ENVIAR </button>
          
        </form>
      </div>
    </div>
  );
}
