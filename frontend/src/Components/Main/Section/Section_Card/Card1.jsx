import Button_card1 from "./Button/Button_Card1";
import Foz from '../../../../assets/img/Foz.jpg'
export default function Card1(){
    return(
        <div class="card">
        <img src={Foz} className="card-img-top" alt=""/>
          <div class="card-texto">
              <span class="nome"> Passagem</span>
              <h2>Apartir de $</h2>
              <p>Lorem ipsum </p>
          </div>
          <Button_card1/>
      </div>

    );
}