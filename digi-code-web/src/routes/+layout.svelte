<script>
	import "../app.css";

	import { SvelteToast } from '@zerodevx/svelte-toast';
</script>

<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Title</title>
	</head>
	<body class="bg-neutral-50 flex flex-col min-h-screen">
		<slot />

		<SvelteToast />
	</body>
</html>
