import { useEffect, useState } from "react";
import Card from "./components/Card";
import Nav from "./components/Nav";
import axios from "axios";

function App() {
  const [data, setData] = useState();

  const getData = () => {
    return axios
      .get("http://localhost:8080/api/Libri/all")
      .then((res) => setData(res.data))
      .catch((err) => console.log(err));
  };

  useEffect(() => {
    getData();
  }, []);

  return (
    <div className="container-fluid">
      <Nav />
      <Card />
    </div>
  );
}

export default App;
