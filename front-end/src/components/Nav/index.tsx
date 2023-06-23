import React from "react";

const Nav = () => {
  return (
    <nav className="row text-secondary p-2 ps-0">
      <div className="col">
        <div className="nav nav-pills justify-content-start">
          <p className="nav-item p-2 px-lg-0">
            <i className="bi bi-book-fill text-green">
              <span className="text-black">PortaleBiblioteca</span>
            </i>
          </p>
        </div>
      </div>
      <div className="col">
        <form className="d-flex justify-content-end " role="search">
          <input
            className="form-control me-2"
            type="search"
            placeholder="Scrivi il titolo del libro..."
            aria-label="Search"
          />
          <button className="btn bg-" type="submit">
            Cerca
          </button>
        </form>
      </div>
    </nav>
  );
};

export default Nav;
