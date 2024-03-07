interface User {
    username: string;
    password: string;
}

// Function to handle form submission
function handleLogin(event: Event) {
    event.preventDefault();
    
    const usernameInput = document.getElementById('username') as HTMLInputElement;
    const passwordInput = document.getElementById('password') as HTMLInputElement;

    const user: User = {
        username: usernameInput.value,
        password: passwordInput.value
    };

    // Perform validation and authentication logic here

    // Example validation - check if fields are not empty
    if (user.username && user.password) {
        // Authentication logic - check against stored credentials or API call

        // Example success message
        console.log('Login successful!');
    } else {
        // Example error message
        console.error('Please enter valid credentials.');
    }
}

// Get the login form element and attach submit event listener
const loginForm = document.getElementById('loginForm');
loginForm.addEventListener('submit', handleLogin);