
import Foz from '../../../../assets/img/Foz.jpg'
import Button_card3 from "./Button/Button_Card3";
export default function Card1(){
    return(
        <div class="card">
        <img src={Foz} className="card-img-top" alt=""/>
          <div class="card-texto">
              <span class="nome"> Passagem</span>
              <h2>Apartir de $</h2>
              <p>Lorem ipsum </p>
          </div>
          <Button_card3/>
      </div>

    );
}