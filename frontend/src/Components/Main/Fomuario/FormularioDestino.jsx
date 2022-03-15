import "../../../Pages/Destino/Destino.css"
import Button_card2 from "../Section/Section_Card/Button/Button.Card2";

export default function FomularioDestino() {
  return (
    <div className="container destino ca ">
      <div className="fundo">
        <h1 className="titulos">Reserve Agora!</h1>
        <form class="formdestino">
          <input type="text" id="nome" name="nome" placeholder="Nome do destino"/>

          <input type="text" id="cidade" name="cidade" placeholder="Cidade" />

          <input type="text" id="estado" name="estado" placeholder="Estado" />

          <label htmlFor="ida" className="titulos" >Ida</label>

          <input type="date" id="ida" name="ida" placeholder="Ida" />

          <label htmlFor="volta" className="titulos">Volta</label>

          <input type="date" id="volta" name="volta" placeholder="volta" />

          <Button_card2/>
          
        </form>
      </div>
    </div>
  );
}
