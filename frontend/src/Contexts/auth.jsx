import React, { createContext } from "react";
import { useState } from "react";

export const AuthContext = createContext();

export const AuthProvaider = ({children}) => {

    const [user, setUser] = useState(null);

    const login =( email, senha) => {
        setUser({id:"", email})
       }

    const logout= () => {}
  return (
    <AuthContext.Provider value={{ authenticated: !!user, user, login, logout }}>

    {children}

    </AuthContext.Provider>
  );
};
