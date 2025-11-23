from flask import Flask, request, jsonify
import os
import openai

app = Flask(__name__)

# Make sure you set your OpenAI API key as an environment variable
openai.api_key = os.getenv("OPENAI_API_KEY")

@app.route("/command", methods=["POST"])
def command():
    data = request.json
    prompt = data.get("prompt", "")

    try:
        response = openai.ChatCompletion.create(
            model="gpt-4",
            messages=[{"role": "user", "content": prompt}],
            temperature=0.7
        )
        answer = response['choices'][0]['message']['content']
    except Exception as e:
        answer = f"Error: {e}"

    return jsonify({"response": answer})

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000)
