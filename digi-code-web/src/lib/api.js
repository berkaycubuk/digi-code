import { toast } from "@zerodevx/svelte-toast";

const baseUrl = "http://localhost:8080";

const get = async (path) => {
	const response = await fetch(baseUrl + path, {
		method: "GET",
		headers: {
			"Content-type": "application/json; charset=UTF-8"
		},
	});

	const json = await response.json();

	if (!response.ok) {
		toast.push(json.message);
		throw new Error("HTTP error! Status: " + response.status);
	}

	return json;
}

const post = async (path, body) => {
	const response = await fetch(baseUrl + path, {
		method: "POST",
		body: JSON.stringify(body),
		headers: {
			"Content-type": "application/json; charset=UTF-8"
		},
	});

	const json = await response.json();

	if (!response.ok) {
		toast.push(json.message);
		throw new Error("HTTP error! Status: " + response.status);
	}

	return json;
}

const del = async (path) => {
	const response = await fetch(baseUrl + path, {
		method: "DELETE",
		headers: {
			"Content-type": "application/json; charset=UTF-8"
		},
	});

	const json = await response.json();

	if (!response.ok) {
		toast.push(json.message);
		throw new Error("HTTP error! Status: " + response.status);
	}

	return json;
}

export {
	get,
	post,
	del,
};
