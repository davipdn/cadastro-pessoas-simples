# Projeto: cadastro-pessoas-simples

Pequeno projeto em Java com um menu para cadastrar e listar pessoas. Ideal para quem está começando a aprender Java.

Estrutura mínima do projeto

```
untitled/
├─ src/
│  ├─ Main.java
│  └─ Condicoes/IfAndElse.java
├─ .gitignore
└─ README.md
```


Como compilar e executar

1) Compile para a pasta `out` (a partir da raiz do projeto):

```bash
cd /Users/daavi/IdeaProjects/untitled
javac -d out src/Main.java src/CadastroPessoasSimples.java
```

2) Execute o `Main`:

```bash
java -cp out Main
```

Ou execute a classe `CadastroPessoasSimples` (agora no pacote padrão / sem package):

```bash
java -cp out CadastroPessoasSimples
```

Observações
- O arquivo `IfAndElse.java` usa `package Condicoes;` — mantenha o arquivo dentro da pasta `src/Condicoes/` para que o pacote funcione corretamente.
- Não comite arquivos compilados (`*.class`) nem a pasta `out/` — o `.gitignore` já está presente para isso.

Como subir para o GitHub (passos rápidos)

1) Inicialize o repositório local (se ainda não tiver feito):

```bash
cd /Users/daavi/IdeaProjects/untitled
git init
git add .
git commit -m "chore: commit inicial do projeto de cadastro"
```

2) Crie um repositório no GitHub (pelo site) e conecte o remoto. Supondo que a URL seja `git@github.com:SEU_USUARIO/NOME_DO_REPO.git`:

```bash
git branch -M main
git remote add origin git@github.com:SEU_USUARIO/NOME_DO_REPO.git
git push -u origin main
```

Alternativa com GitHub CLI (se tiver `gh` instalado):

```bash
gh auth login
gh repo create NOME_DO_REPO --public --source=. --remote=origin --push
```

Boas práticas de commits
- Use mensagens curtas e descritivas: `feat: adicionar menu` ou `fix: corrigir leitura de entrada`.
- Faça commits pequenos e atômicos (cada mudança lógica em um commit).

Se quiser que eu faça mais ajustes antes de você subir (ex.: renomear o pacote para minúsculo, separar em pastas `src/main/java` estilo Maven, adicionar LICENSE), diga o que prefere — mantenho tudo do jeito atual se você quiser só organizar para o GitHub.

