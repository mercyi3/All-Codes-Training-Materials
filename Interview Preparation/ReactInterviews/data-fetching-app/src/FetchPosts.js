import React, { useState, useEffect } from "react";

const CatImage = () => {
  const [catImageUrl, setCatImageUrl] = useState("");

  const fetchCatImage = () => {
    fetch("https://api.thecatapi.com/v1/images/search")
      .then((res) => res.json())
      .then((data) => {
        setCatImageUrl(data[0].url);
      })
      .catch((error) => {
        console.error("Error fetching cat image:", error);
      });
  };

  useEffect(() => {
    fetchCatImage();
  }, []);

  return (
    <div style={{ textAlign: "center", padding: "20px" }}>
      <h2>Random Cat Image 🐾</h2>
      {catImageUrl ? (
        <img src={catImageUrl} alt="Random Cat" style={{ maxWidth: "400px", borderRadius: "12px" }} />
      ) : (
        <p>Loading...</p>
      )}
      <br />
      <button onClick={fetchCatImage} style={{ marginTop: "15px", padding: "10px 20px" }}>
        Load Another Cat 😺
      </button>
    </div>
  );
};

// export default CatImage;
