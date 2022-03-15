import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import Home from './Pages/Home/Home';
import Destino from './Pages/Destino/Destino'
import Promocoes from './Pages/Promocoes/Promocoes'
import Contato from './Pages/Contato/Contato'
import Login from './Pages/Login/Login'
import Cadastro from './Pages/Cadastro/Cadastro'
import { BrowserRouter as Router,Route, Routes,} from 'react-router-dom';

ReactDOM.render(
    <React.StrictMode>
                  
        <Router>         
           <Routes> 
            <Route path="/" exact element ={<Home/>}></Route>
            <Route path="/Destino" element ={<Destino/>}></Route>
            <Route path="/Promocoes" element ={<Promocoes/>}></Route>
            <Route path="/Contato" element ={<Contato/>}></Route>
            <Route path="/Login" element ={<Login/>}></Route>
            <Route path="/Cadastro" element ={<Cadastro/>}></Route>
           </Routes>
       </Router>    
      
    </React.StrictMode>,
    document.getElementById('root')
);