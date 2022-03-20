import '../Section_Card/Cards.css';
import london from "../../../../assets/img/london.jpg"
import ButtonCard2 from './Button/Button.Card2';
export default function Cards2(){
    return(
        <div className="card">
          <img src={london} className="card-img-top" alt=""/>
            <div className="card-texto">
                <span className="nome"> Passagem</span>
                <h2>Apartir de $</h2>
                <p>Lorem ipsum </p>
            </div>
            <ButtonCard2/>
        </div>
    );
}
