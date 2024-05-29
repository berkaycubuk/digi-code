const setCookie = (name, value, expire) => {
	const d = new Date();
	d.setTime(d.getTime() + (expire * 24 * 60 * 60 * 1000));
	let expires = "expires=" + d.toUTCString();
	document.cookie = name + "=" + value + ";" + expires + ";path=/";
}

const getCookie = (cname) => {
	let name = cname + "=";
	let decodedCookie = decodeURIComponent(document.cookie);
	let ca = decodedCookie.split(";");
	for (let i = 0; i < ca.length; i++) {
		let c = ca[i];
		while (c.charAt(0) == ' ') {
			c = c.substring(1);
		}
		if (c.indexOf(name) == 0) {
				return c.substring(name.length, c.length);
		}
	}
	
	return "";
}

const deleteCookie = (name) => {
	if (getCookie(name) == "") return;

	document.cookie = name + "=;expires=Thu, 01 Jan 1970 00:00:01 GMT";
}

export {
	setCookie,
	getCookie,
	deleteCookie,
}
