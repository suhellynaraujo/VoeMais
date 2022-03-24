import Tropical from "../../../../../assets/img/Tropical.jpg";
import '../../Section_Card/CardN/CardN.css';
import ButtonCard2 from "../Button/Button.Card2";

export  default function CardN(){
  
  return(
    
    <div className="card">
      <img src={Tropical} className="card-img-top" alt="..."/>
      <div className="card-texto">
        <span className="nome"> Passagem</span>
        <h2>a partir de 500$</h2>
        <p>Lorem ipsum, dolor sit</p>
      </div>
      
    <ButtonCard2 Link to={"/Destino"}/>
    </div>
    
  );
}