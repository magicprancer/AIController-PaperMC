#!/bin/bash

# Start the AI backend
cd backend
export OPENAI_API_KEY=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
nohup python3 ai_backend.py &> backend.log &

# Start the PaperMC server
cd ../server
java -Xms2G -Xmx4G -jar paper-1.20.1.jar nogui
