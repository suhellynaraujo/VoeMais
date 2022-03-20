import '../Section_Card/Cards.css';
import london from "../../../../assets/img/london.jpg"
import ButtonCard1 from './Button/Button_Card1';
export default function Cards2(){
    return(
        <div class="card">
          <img src={london} className="card-img-top" alt=""/>
            <div class="card-texto">
                <span class="nome"> Passagem</span>
                <h2>Apartir de $</h2>
                <p>Lorem ipsum </p>
            </div>
            <ButtonCard1/>
        </div>
    );
}
