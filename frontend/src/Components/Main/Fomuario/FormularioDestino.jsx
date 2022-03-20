import { useNavigate } from "react-router-dom";
import { useRef } from "react";
import "../../../Pages/Destino/Destino.css"
import api from "../../../Server/api";

export default function FomularioDestino() {

  const navigate = useNavigate();
  
  const nome = useRef();
  const cidade = useRef();
  const uf = useRef();
  const ida = useRef();
  const volta = useRef();

 
  const Cadastrar = (event) => {
    event.preventDefault();    
      api.post("/destino/", {
        nome: nome.current.value,
        cidade: cidade.current.value,
        uf: uf.current.value,
        ida: ida.current.value,
        volta: volta.current.value
      })
      .then(() => navigate("/")).catch((err) => console.log(err));
      
  };

  const Cadastrado = () => {
   
    if((nome || cidade || uf) === null){
      alert("Realize seu cadastro inserindo as informações nos campos corretamente!")
    }
    else{
      alert(" Seu destino foi resesrvado!")
    }
    

  };



  return (
    <div className="container destino ca ">
      <div className="fundo">
        <h1 className="titulos">Reserve Agora!</h1>
        <form class="formdestino" onSubmit={Cadastrar}>
          <input type="text" id="nome" name="nome" placeholder="Nome do destino" ref={nome}/>

          <input type="text" id="cidade" name="cidade" placeholder="Cidade" ref={cidade}/>

          <input type="text" id="uf" name="uf" placeholder="Uf" ref={uf}/>

          <label htmlFor="ida" className="titulos" ref={ida}>Ida</label>

          <input type="date" id="ida" name="ida" placeholder="Ida"/>

          <label htmlFor="volta" className="titulos"  ref={volta}>Volta</label>

          <input type="date" id="volta" name="volta" placeholder="volta" />

          <input className="btn2" type="submit" onClick={Cadastrado}/>
          
        </form>
      </div>
    </div>
  );
}
