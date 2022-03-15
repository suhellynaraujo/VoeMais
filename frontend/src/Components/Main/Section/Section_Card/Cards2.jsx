import '../Section_Card/Cards.css';
import Button_card1 from "./Button/Button_Card1";
import london from "../../../../assets/img/london.jpg"
export default function Cards2(){
    return(
        <div class="card">
          <img src={london} className="card-img-top" alt=""/>
            <div class="card-texto">
                <span class="nome"> Passagem</span>
                <h2>Apartir de $</h2>
                <p>Lorem ipsum </p>
            </div>
            <Button_card1/>
        </div>
    );
}
