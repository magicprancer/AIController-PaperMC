#!/bin/bash

# Start the AI backend
cd backend
export OPENAI_API_KEY=sk-proj-Put-key-here
nohup python3 ai_backend.py &> backend.log &

# Start the PaperMC server
cd ../server
java -Xms2G -Xmx4G -jar paper-1.21.10-115.jar nogui
