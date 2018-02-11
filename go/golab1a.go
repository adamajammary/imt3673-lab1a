package golab1a		// Library
//package main		// Executable

import (
	"encoding/hex"
	"fmt"
	"hash"
	"crypto/sha256"
	"golang.org/x/crypto/sha3"
	"golang.org/x/crypto/ripemd160"
	"golang.org/x/crypto/blake2s"
)

func HashText(text string, method string) string {
	var hasher hash.Hash
	var err    error
	
	switch method {
	case "SHA256":
		hasher = sha256.New()
	case "SHA3-256":
		hasher = sha3.New256()
	case "RIPEMD160":
		hasher = ripemd160.New()
	case "BLAKE2s-256":
		hasher, err = blake2s.New256(nil)
	default:
		return "Unsupported hash method";
	}
	
	if (err != nil) {
		return fmt.Sprintf("ERROR: %s", err.Error())
	}
	
	return hex.EncodeToString(hasher.Sum([]byte(text)))
}

func main() {
	fmt.Printf("HashText[SHA256]:\t%s\n",      HashText("TEST", "SHA256"))
	fmt.Printf("HashText[SHA3-256]:\t%s\n",    HashText("TEST", "SHA3-256"))
	fmt.Printf("HashText[RIPEMD160]:\t%s\n",   HashText("TEST", "RIPEMD160"))
	fmt.Printf("HashText[BLAKE2s-256]:\t%s\n", HashText("TEST", "BLAKE2s-256"))
	fmt.Printf("HashText[MD5]:\t\t%s\n",       HashText("TEST", "MD5"))
}
