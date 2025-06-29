fn main() {
    let mut matriz = [[0; 18]; 18];
    for i in 0..matriz.len() / 2 {
        for j in i..(matriz.len() as i32 - i as i32) as usize {
            for k in i..(matriz[i].len() as i32 - i as i32) as usize {
                matriz[j][k] += 1;
            }
        }
    }
    for line in &matriz {
        println!("{:?}", line);
    }
}
