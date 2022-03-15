import Tropical from "../../../../../assets/img/Tropical.jpg";
import '../../Section_Card/CardN/CardN.css';
import Button_card2 from "../Button/Button.Card2";
export  default function CardN(){
  return(
    
    <div class="card">
      <img src={Tropical} className="card-img-top" alt="..."/>
      <div class="card-texto">
        <span class="nome"> Passagens</span>
        <h2>a partir de 00$</h2>
        <p>Lorem ipsum, dolor sit</p>
      </div>
      
    <Button_card2></Button_card2>
    </div>
    
  );
}