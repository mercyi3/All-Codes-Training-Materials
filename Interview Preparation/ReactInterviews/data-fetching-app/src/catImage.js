import React, { useState, useEffect } from 'react';

 const CatsImage = () => {
    const [catImageUrl, setCatImageUrl] = useState("");

    const fetchCatImage = () => {
        fetch("https://api.thecatapi.com/v1/images/search")
        .then((res) => res.json())
        .then((data) => {
            setCatImageUrl(data[0].url);
        })
        .catch((error) => {
            console.log("Cannot fetch images")
        })
    }

    useEffect(() => {
        fetchCatImage();
    }, []);

    return (
        <div style={{ textAlign: "center", padding: "20px"}}>
            <h2>Random Cat Images</h2>
            {catImageUrl ?
            <img src={catImageUrl} alt="Random Cats" style={{ maxWidth: "400px", borderRadius: "12px"}} /> 
            : <h4>Loading...</h4>
            } <br />
            <button onClick={fetchCatImage} style={{ marginTop: "15px", padding: "10px 20px"}}>Load Anothe Image</button>
        </div>
    )
};

export default CatsImage;