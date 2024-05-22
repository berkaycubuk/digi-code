<script>
	import AuthCard from "$lib/components/AuthCard.svelte";

	import { post } from "$lib/api";

	let firstName;
	let lastName;
	let email;
	let password;

	const register = async () => {
		try {
			const response = await post('/api/v1/auth/register', {
				firstName: firstName,
				lastName: lastName,
				email: email,
				password: password,
			});

			console.log(response);
		} catch(error) {
			console.log(error);
		}
	}
</script>

<AuthCard title="Create a new account">
	<form class="flex flex-col gap-4">

		<div class="grid grid-cols-2 gap-4">

			<div class="flex flex-col gap-2">
				<label for="firstName" class="text-neutral-600 font-light">First name</label>
				<input id="firstName" type="text" class="input" bind:value={firstName} />
			</div>

			<div class="flex flex-col gap-2">
				<label for="lastName" class="text-neutral-600 font-light">Last name</label>
				<input id="lastName" type="text" class="input" bind:value={lastName}/>
			</div>

		</div>

		<div class="flex flex-col gap-2">
			<label for="email" class="text-neutral-600 font-light">E-mail</label>
			<input id="email" type="email" class="input" bind:value={email} />
		</div>

		<div class="flex flex-col gap-2">
			<label for="password" class="text-neutral-600 font-light">Password</label>
			<input id="password" type="email" class="input" bind:value={password} />
		</div>

		<div>
			<button class="button" on:click={register}>Register</button>
		</div>

		<p class="font-light text-neutral-600">
			Already have an account? <a class="font-normal text-neutral-800" href="/login">Login</a> to your account.
		</p>

	</form>
</AuthCard>
