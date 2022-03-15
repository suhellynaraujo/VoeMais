import './Cards.css';
import Nacional from "../../../../assets/img/Nacional.jpg"
import Button_card1 from './Button/Button_Card1';
export default function Cards(){
    return(
        <div class="card">
          <img src={Nacional} className="card-img-top" alt="Cristo"/>
            <div class="card-texto">
                <span class="nome"> Passagem</span>
                <h2>Apartir de $</h2>
                <p>Lorem ipsum </p>
            </div>
            <Button_card1/>
        </div>
    );
   
}
