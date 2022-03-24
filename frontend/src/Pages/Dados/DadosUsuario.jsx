import { useEffect,useState } from "react";
import api from "../../Server/api";

export default function DadosUsuario(){

    const [destino, setDestino] = useState([])
    
    useEffect(() =>{
        api.get("/destino")
        .then((response) => setDestino(response.data))
        .catch((error) => console.log(error))
    }, [destino])


    return(
<div></div>
    )
}