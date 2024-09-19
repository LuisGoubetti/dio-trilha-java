classDiagram
    class Iphone {
    }
 
    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }
 
    class Navegador {
        <<interface>>
        +exibirPagina()
        +adicionarNovaAba(String url)
        +atualizarPagina()
    }
 
    class aparelhoTelefonico{
        <<interface>>
        +atender()
        +iniciarCorreioEletronico()
        +ligar(String numero)
 
    }
 
 
    Iphone <|-- ReprodutorMusical
    Iphone <|-- Navegador
    Iphone <|-- aparelhoTelefonico