let speed = 1.0;
let speedDisplay = null;
let fadeTimeout = null;

// Create floating speed indicator
function createSpeedDisplay() {
  if (speedDisplay) return;

  const player = document.querySelector('.html5-video-player');
  if (!player) return;

  speedDisplay = document.createElement('div');
  speedDisplay.style.position = 'absolute';
  speedDisplay.style.top = '10px';
  speedDisplay.style.left = '10px';
  speedDisplay.style.color = 'white';
  speedDisplay.style.fontSize = '14px';
  speedDisplay.style.fontWeight = 'bold';
  speedDisplay.style.background = 'rgba(0, 0, 0, 0.6)';
  speedDisplay.style.padding = '2px 6px';
  speedDisplay.style.borderRadius = '4px';
  speedDisplay.style.zIndex = '9999';
  speedDisplay.style.pointerEvents = 'none';
  speedDisplay.style.transition = 'opacity 0.5s ease';
  speedDisplay.style.opacity = '0';

  speedDisplay.textContent = `${speed.toFixed(2)}x`;
  player.appendChild(speedDisplay);
}

// Show speed and trigger fade-out
function showSpeedDisplay() {
  if (!speedDisplay) return;
  speedDisplay.style.opacity = '1';
  clearTimeout(fadeTimeout);
  fadeTimeout = setTimeout(() => {
    speedDisplay.style.opacity = '0';
  }, 3000);
}

// Set video speed and update display
function setSpeed(newSpeed) {
  speed = Math.min(Math.max(newSpeed, 0.1), 10.0);
  document.querySelectorAll('video').forEach(video => {
    video.playbackRate = speed;
  });

  if (speedDisplay) {
    speedDisplay.textContent = `${speed.toFixed(2)}x`;
    showSpeedDisplay();
  }
}

// Handle keyboard shortcuts
document.addEventListener('keydown', (e) => {
  if (e.altKey && e.code === 'KeyV') {
    setSpeed(speed + 0.25);
  }
  if (e.altKey && e.code === 'KeyC') {
    setSpeed(speed - 0.25);
  }
  if (e.altKey && e.code === 'KeyX') {
    setSpeed(1);
  }
});

// Inject speed display once YouTube player is ready
const observer = new MutationObserver(() => {
  const player = document.querySelector('.html5-video-player');
  if (player) {
    createSpeedDisplay();
  }
});

observer.observe(document.body, { childList: true, subtree: true });
