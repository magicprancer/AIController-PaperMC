# AIController-PaperMC (Quick Setup)

Control NPCs and admin actions in Minecraft with AI (GPT) using PaperMC.

---

## 1️⃣ Folder Setup

Create these folders in your repo:


---

## 2️⃣ Download Required Files

- **PaperMC 1.20.1** → put in `server/`  
  [https://papermc.io/downloads](https://papermc.io/downloads)

- **Citizens plugin** → put in `server/plugins/`  
  [https://www.spigotmc.org/resources/citizens.13811/](https://www.spigotmc.org/resources/citizens.13811/)

> Note: Do **not** commit `.jar` files to GitHub.

---

## 3️⃣ Install Python Backend

```bash
cd backend
pip install -r requirements.txt
export OPENAI_API_KEY="YOUR_OPENAI_KEY"
chmod +x start.sh
./start.sh

---

This is **super beginner-friendly** — it explains **only the essential steps** to get the AI server running.  

I can also **write a tiny “commands cheat sheet”** for the AI plugin so you know what to type in Minecraft.  

Do you want me to make that?
