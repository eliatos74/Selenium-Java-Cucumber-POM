#language: pt

@mensagem
Funcionalidade: Cadastro de usuário

@mensagem-sucesso
Cenario: Enviar uma mensagem com sucesso
Dado que estou na tela de mensagem
E preencho todos os campos
Quando clico em enviar mensagem
Então vejo a mensagem enviada com sucesso