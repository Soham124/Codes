const myForm = document.querySelector('.feedback-form')
console.log(myForm)

myForm.addEventListener('submit' , function(e){
      e.preventDefault()
      let usernameValue = myForm.username.value
      let feedbackValue = myForm.feedback.value

      console.log(usernameValue)
      console.log(feedbackValue)
})