fetch(baseURL + "/artists")
    .then(response => response.json()) //Får et svar som konverteres til Json
    .then(artists => {
        console.log(artists)
        const artistsElement = document.getElementById("artists")
        artists.map(artist => {
            const artistdiv = document.createElement("div")
            artistdiv.innerHTML =`
                    <p>${artist.name}</p>
                    <p>${artist.age.toString()}</p>
                    <p>${artist.gender}</p>
                    <p>${artist.primary_style}</p>`

            artistsElement.appendChild(artistdiv)
        })
    });

const artistsGalleryWrapper = document.getElementById("artists-gallery");

function createArtistCard(artist) {
    const artistElement = document.createElement("div");
    artistElement.innerText = artist.name;
    artistElement.innerText = artist.image;

    artistsGalleryWrapper.appendChild(artistElement);
}

function createNewArtist() {
    const name = document.getElementById("create-artist-name").value;
    const age = document.getElementById("create-artist-age").value;
    const image = document.getElementById("create-artist-image").value;
    const gender = document.getElementById("create-artist-gender").value;

    const newArtist = {
        name: name,
        age: Number(age),
        image: image,
        gender: gender
    };


    // todo show the newly created artist on the page
    // todo think veeeeerry carefully WHERE you would like to do this
    fetch("http://localhost:8080/artists", {
        method: "POST",
        headers: {
            "Content-type": "application/json; charset=UTF-8"
        },
        body: JSON.stringify(newArtist)
    })
        .then(response => {
            if (response.status === 200) {
                createArtistCard(newArtist);
            } else {
                console.log("Artist not created.", response.status);
            }
        })
        .catch(error => console.log("Network related error", error));

}

document.getElementById("create-artist-button")
    .addEventListener("click", createNewArtist);