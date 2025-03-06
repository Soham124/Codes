const userNameText = document.querySelector(".userName");
const userAgeText = document.querySelector(".userAge");

const saveNameButton = document.querySelector(".saveNameBtn");
const saveAgeButton = document.querySelector(".saveAgeBtn");

saveNameButton.addEventListener("click", () => {
  const userName = document.querySelector(".name").value;
  userNameText.textContent = userName;
  localStorage.setItem("name", userName);
});

//Output:

function displayUserName() {
  const nameFromLocalStorage = localStorage.getItem("name");

  if (nameFromLocalStorage) {
    userNameText.textContent = nameFromLocalStorage;
  } else {
    userNameText.textContent = "No name data in local storage";
  }
}

displayUserName();

saveAgeButton.addEventListener("click", () => {
  const userAge = document.querySelector(".age").value;
  userAgeText.textContent = userAge;
  sessionStorage.setItem("age", userAge);
});

function displayUserAge() {
  const ageFromSessionStorage = sessionStorage.getItem("age");

  if (ageFromSessionStorage) {
    userAgeText.textContent = ageFromSessionStorage;
  } else {
    userAgeText.textContent = "No age data in session storage";
  }
}

displayUserAge();
