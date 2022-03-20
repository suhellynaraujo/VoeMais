import './Cards.css';
import Nacional from "../../../../assets/img/Nacional.jpg"
import ButtonCard2 from './Button/Button.Card2';
export default function Cards(){
    return(
        <div className="card">
          <img src={Nacional} className="card-img-top" alt="Cristo"/>
            <div class="card-texto">
                <span class="nome"> Passagem</span>
                <h2>Apartir de $</h2>
                <p>Lorem ipsum </p>
            </div>
            
            <ButtonCard2/>
        </div>
    );
   
}
