fn main() {
    let mut i = 1.0;
    let mut j = 1.0;
    let mut soma = 0.0;
    while i <= 64.0 {
        soma += i / j;
        i += 1.0;
        j += 2.0;
    }
    println!("O valor da serie é {:.2}.", soma);
}
