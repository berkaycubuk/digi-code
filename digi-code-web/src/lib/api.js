const baseUrl = "http://localhost:8080";

const get = async (path) => {
	const response = await fetch(baseUrl + path, {
		method: "GET",
		headers: {
			"Content-type": "application/json; charset=UTF-8"
		},
	});

	if (!response.ok) {
		throw new Error("HTTP error! Status: " + response.status);
	}

	return response.json();
}

const post = async (path, body) => {
	const response = await fetch(baseUrl + path, {
		method: "POST",
		body: JSON.stringify(body),
		headers: {
			"Content-type": "application/json; charset=UTF-8"
		},
	});

	if (!response.ok) {
		throw new Error("HTTP error! Status: " + response.status);
	}

	return response.json();
}

export {
	get,
	post,
};
