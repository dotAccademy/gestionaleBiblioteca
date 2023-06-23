import React from "react";

const Card = () => {
  return (
    <div className="col-sm-6 col-lg-3 mb-3">
      <div
        className="card"
        style={{ backgroundColor: "transparent", border: "none" }}
      >
        <img
          style={{ height: "350px", objectFit: "cover", borderRadius: "12px" }}
          src="ciao"
          className="card-img-top"
          alt="esterno"
        />
        <div className="card-body">
          <h4 className="card-title">nome author</h4>

          <p className="d-flex justify-content-between">descrizione</p>
          <p className="d-flex justify-content-between">prezzo</p>
          <div>
            <div className="bg-dark text-white btn">Dettagli!</div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Card;
