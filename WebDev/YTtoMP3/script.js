function getVideoID(url) {
    //two youtube url fromats
    //checks if the URL contains "youtube.com/watch?v=" or "youtu.be/"
    if (url.includes("youtube.com/watch?v=")) {
        return url.split("v=")[1].split("&")[0];
    } else if (url.includes("youtu.be/")) {
        return url.split("youtu.be/")[1].split("?")[0];
    } else {
        return null; //if URL is not valid, return null
    }
}

function convertVideo() {
    var url = document.getElementById("youtubeUrl").value;
    var videoID = getVideoID(url);

    if (videoID) {
        var converterDiv = document.getElementById("converter"); //gets the div where iframe will be added
        converterDiv.innerHTML = ""; //clears previous iframe if any

        var iframe = document.createElement("iframe"); //creates an iframe element
        iframe.width = "100%";
        iframe.height = "100px";
        iframe.style.border = "none";
        iframe.style.borderRadius = "20px";
        iframe.src = "https://apiyt.com/iframe/?vid=" + videoID + "&color=FF429D&utm_source=api"; 
        
        converterDiv.appendChild(iframe); // Add iframe to the page
    } else {
        alert("Please enter a valid YouTube URL."); //shows alert if URL is invalid
    }
}