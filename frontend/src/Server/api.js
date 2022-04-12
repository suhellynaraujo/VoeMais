import axios from "axios";

const api = axios.create({
    baseURL: "https://voe-mais.herokuapp.com"
})

export default api;
