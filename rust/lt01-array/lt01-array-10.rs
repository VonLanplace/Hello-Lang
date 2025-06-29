fn main() {
    let mut matriz = [[0.0; 8]; 8];
    let mut k = 0.0;
    for i in 0..matriz.len() {
        for j in 0..matriz[i].len() {
            matriz[i][j] = 2_f32.powf(k);
            k += 1.0;
        }
    }
    for line in &matriz {
        println!("{:?}", line);
    }
}
