<script>
	import AuthCard from "$lib/components/AuthCard.svelte";

	import { post } from "$lib/api";
	import { getCookie, setCookie } from "$lib/cookie";

	let email;
	let password;

	const login = async () => {
		try {
			const response = await post('/api/v1/auth/login', {
				email: email,
				password: password,
			});

			setCookie("auth_token", response.token, 30);
		} catch(error) {
			console.log(error);
		}
	}
</script>

<AuthCard title="Login to your account">
	<form class="flex flex-col gap-4">

		<div class="flex flex-col gap-2">
			<label for="email" class="text-neutral-600 font-light">E-mail</label>
			<input id="email" type="email" class="input" bind:value={email} />
		</div>

		<div class="flex flex-col gap-2">
			<label for="password" class="text-neutral-600 font-light">Password</label>
			<input id="password" type="password" class="input" bind:value={password} />
		</div>

		<div>
			<button class="button" on:click={login}>Login</button>
		</div>

		<p class="font-light text-neutral-600">
			Don't have an account? <a class="font-normal text-neutral-800" href="/register">Create new account</a>.
		</p>

	</form>
</AuthCard>
